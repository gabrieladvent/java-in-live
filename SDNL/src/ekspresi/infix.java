/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspresi;

/**
 *
 * @author Tak Bertuan
 */
public class infix {
    char ung [];
    konstaInfix karInfix = new konstaInfix ();
    stack opr;
    stack opd;
    
public infix (char ung []){
    this.ung = ung;
}

public int valensi (char data){
    if (data == '^') {
        return 3;
    } else if ((data == '*') || (data == '/')) {
        return 2;
    } else if ((data == '+') || (data == '-')) {
        return 1;
    } else if (data == '('){
        return 0;
    } else {
        return -1;
    }
}

public TreeNode gbng () {
    TreeNode pohon = opr.pop();
    pohon.rightNode = opd.pop();
    pohon.leftNode = opd.pop();
    return pohon;
}

public TreeNode buat (){
    char kar;
    TreeNode treeKar;
    TreeNode cek;
    opr = new stack ();
    opd = new stack ();
    
    for (int i = 0; i < ung.length; i++) {
        kar = ung [i];
        karInfix.setData(kar);
        if (kar != ' ') {
            treeKar = new TreeNode(kar);
            if (kar == '(') {
                opr.push(treeKar);
            } else if (kar == ')') {
                cek = opr.pop();
                opr.push(cek);
                while (cek.data != '('){
                    opd.push(gbng());
                    cek = opr.pop();
                    opr.push(cek);
                }
                opr.pop();
            } else if (karInfix.isOperator()) {
                cek = opr.pop();
                opr.push(cek);
                while ((cek != null) && (valensi (kar) <= valensi (cek.data))){
                    opd.push(gbng());
                    cek = opr.pop();
                    opr.push(cek);
                }
                opr.push(treeKar);
            } else if (karInfix.isOperand()){
                opd.push(treeKar);
            } else {
                return null;
            }
        }
    }
    cek = opr.pop();
    opr.push(cek);
    while (cek != null){
        opd.push(gbng());
        cek = opr.pop();
        opr.push(cek);
    }
    cek = opd.pop();
    opr = null;
    opd = null;
    return cek;
}
}