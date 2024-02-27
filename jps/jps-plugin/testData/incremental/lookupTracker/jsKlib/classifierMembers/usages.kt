package foo

import bar.*

/*p:foo*/fun usages(i: /*p:bar p:foo*/I) {
    /*p:foo p:foo.A(a)*/A().a
    /*p:foo p:foo.A(b)*/A().b
    /*p:foo p:foo.A(c)*/A().c
    /*p:foo p:foo.A(d)*/A().d = "new value"
    /*p:foo p:foo.A(foo)*/A().foo()
    /*p:foo p:foo(B) p:foo.A.B(a)*/A.B().a
    /*p:bar(bar) p:foo p:foo(bar) p:foo.A.B.CO(bar)*/A.B.bar(1)
    /*p:bar(bar) p:foo p:foo(bar) p:foo.A.B.CO(bar)*/A.B.CO.bar(1)
    /*p:foo*/A
    /*p:foo p:foo.A(a) p:foo.A.Companion(a)*/A.a
    /*p:bar(baz) p:foo p:foo(baz) p:foo.A(baz) p:foo.A.Companion(baz)*/A.baz()
    /*p:foo*/A.Companion
    /*p:bar(baz) p:foo p:foo(baz) p:foo.A(baz) p:foo.A.Companion(baz)*/A.Companion.baz()
    /*p:foo*/A.O
    /*p:foo p:foo.A.O(v)*/A.O.v = "OK"

    /*p:foo.I(a)*/i.a = 2
    /*p:foo p:foo.Obj(a)*/Obj.a
    /*p:bar(foo) p:foo p:foo(foo) p:foo.Obj(foo)*/Obj.foo()
    var ii: /*p:bar p:foo*/I = /*p:foo*/Obj
    /*p:foo.I(a)*/ii.a
    /*p:foo.I(foo)*/ii.foo()
    /*p:foo p:foo.Obj(b)*/Obj.b
    val iii = /*p:bar(bar) p:foo p:foo(I) p:foo(bar) p:foo.Obj(bar)*/Obj.bar()
    /*p:foo.I(foo)*/iii.foo()

    /*p:bar p:foo p:foo.E(X)*/E.X
    /*p:bar p:foo p:foo.E(X) p:foo.E(a)*/E.X.a
    /*p:bar p:foo p:foo.E(Y) p:foo.E(foo)*/E.Y.foo()
    /*p:bar p:foo p:foo.E(values) p:kotlin(Array)*/E.values()
    /*p:bar p:foo p:foo.E(valueOf)*/E.valueOf("")
}

/*p:foo*/fun classifiers(
        a: /*p:bar p:foo*/A,
        ab: /*p:bar p:foo*/A.B,
        ac: /*p:bar p:foo*/A.C,
        abCo: /*p:bar p:foo*/A.B.CO,
        aCompanion: /*p:bar p:foo*/A.Companion,
        aO: /*p:bar p:foo*/A.O,
        i: /*p:bar p:foo*/I,
        ni: /*p:bar p:foo*/I.NI,
        obj: /*p:bar p:foo*/Obj,
        e: /*p:bar p:foo*/E
) {}
