// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class EpochTime extends ReqlExpr {


    public EpochTime(Object arg) {
        this(new Arguments(arg), null);
    }
    public EpochTime(Arguments args){
        this(args, null);
    }
    public EpochTime(Arguments args, OptArgs optargs) {
        super(TermType.EPOCH_TIME, args, optargs);
    }

}
