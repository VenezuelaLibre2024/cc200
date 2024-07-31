.class public Lt3/n1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/n1$a;
    }
.end annotation


# instance fields
.field public final a:Lp5/d;

.field public final b:Ls3/u3$b;

.field public final c:Ls3/u3$d;

.field public final d:Lt3/n1$a;

.field public final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lt3/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lp5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/q<",
            "Lt3/b;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ls3/b3;

.field public h:Lp5/n;

.field public i:Z


# direct methods
.method public constructor <init>(Lp5/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/d;

    iput-object v0, p0, Lt3/n1;->a:Lp5/d;

    new-instance v0, Lp5/q;

    invoke-static {}, Lp5/n0;->Q()Landroid/os/Looper;

    move-result-object v1

    sget-object v2, Lt3/i1;->a:Lt3/i1;

    invoke-direct {v0, v1, p1, v2}, Lp5/q;-><init>(Landroid/os/Looper;Lp5/d;Lp5/q$b;)V

    iput-object v0, p0, Lt3/n1;->f:Lp5/q;

    new-instance p1, Ls3/u3$b;

    invoke-direct {p1}, Ls3/u3$b;-><init>()V

    iput-object p1, p0, Lt3/n1;->b:Ls3/u3$b;

    new-instance v0, Ls3/u3$d;

    invoke-direct {v0}, Ls3/u3$d;-><init>()V

    iput-object v0, p0, Lt3/n1;->c:Ls3/u3$d;

    new-instance v0, Lt3/n1$a;

    invoke-direct {v0, p1}, Lt3/n1$a;-><init>(Ls3/u3$b;)V

    iput-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lt3/n1;->e:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic A0(Lt3/b$a;ZILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->M1(Lt3/b$a;ZILt3/b;)V

    return-void
.end method

.method public static synthetic A1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->r0(Lt3/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic B0(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->O1(Lt3/b$a;ILt3/b;)V

    return-void
.end method

.method public static synthetic B1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->t(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic C0(Lt3/b$a;Ls3/z3;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->a2(Lt3/b$a;Ls3/z3;Lt3/b;)V

    return-void
.end method

.method public static synthetic C1(Lt3/b$a;IJLt3/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lt3/b;->s0(Lt3/b$a;IJ)V

    return-void
.end method

.method public static synthetic D0(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->j1(Lt3/b$a;Lv3/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic D1(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->j0(Lt3/b$a;Z)V

    invoke-interface {p2, p0, p1}, Lt3/b;->Y(Lt3/b$a;Z)V

    return-void
.end method

.method public static synthetic E0(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->P1(Lt3/b$a;ILt3/b;)V

    return-void
.end method

.method public static synthetic E1(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->L(Lt3/b$a;Z)V

    return-void
.end method

.method public static synthetic F0(Lt3/b$a;ZILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->S1(Lt3/b$a;ZILt3/b;)V

    return-void
.end method

.method public static synthetic F1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->o0(Lt3/b$a;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic G0(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->I1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V

    return-void
.end method

.method public static synthetic G1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->u(Lt3/b$a;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic H0(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->k1(Lt3/b$a;Lv3/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic H1(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;ZLt3/b;)V
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lt3/b;->N(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic I0(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->Z1(Lt3/b$a;ILt3/b;)V

    return-void
.end method

.method public static synthetic I1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->E(Lt3/b$a;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic J0(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->D1(Lt3/b$a;ZLt3/b;)V

    return-void
.end method

.method public static synthetic J1(Lt3/b$a;Ls3/u1;ILt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->J(Lt3/b$a;Ls3/u1;I)V

    return-void
.end method

.method public static synthetic K(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->g1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V

    return-void
.end method

.method public static synthetic K0(Lt3/n1;Ls3/b3;Lt3/b;Lp5/l;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt3/n1;->m2(Ls3/b3;Lt3/b;Lp5/l;)V

    return-void
.end method

.method public static synthetic K1(Lt3/b$a;Ls3/z1;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->c0(Lt3/b$a;Ls3/z1;)V

    return-void
.end method

.method public static synthetic L(Lt3/b$a;IZLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->u1(Lt3/b$a;IZLt3/b;)V

    return-void
.end method

.method public static synthetic L0(Lt3/b;Lp5/l;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->d1(Lt3/b;Lp5/l;)V

    return-void
.end method

.method public static synthetic L1(Lt3/b$a;Lk4/a;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->A(Lt3/b$a;Lk4/a;)V

    return-void
.end method

.method public static synthetic M(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->E1(Lt3/b$a;ZLt3/b;)V

    return-void
.end method

.method public static synthetic M0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->y1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic M1(Lt3/b$a;ZILt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->y0(Lt3/b$a;ZI)V

    return-void
.end method

.method public static synthetic N(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->i2(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V

    return-void
.end method

.method public static synthetic N0(Lt3/b$a;JLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->m1(Lt3/b$a;JLt3/b;)V

    return-void
.end method

.method public static synthetic N1(Lt3/b$a;Ls3/a3;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->i0(Lt3/b$a;Ls3/a3;)V

    return-void
.end method

.method public static synthetic O(Lt3/n1;)V
    .locals 0

    invoke-virtual {p0}, Lt3/n1;->n2()V

    return-void
.end method

.method public static synthetic O0(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->g2(Lt3/b$a;Lv3/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic O1(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->W(Lt3/b$a;I)V

    return-void
.end method

.method public static synthetic P(Lt3/b$a;Lq5/y;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->j2(Lt3/b$a;Lq5/y;Lt3/b;)V

    return-void
.end method

.method public static synthetic P0(Lt3/b$a;Ljava/lang/String;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->i1(Lt3/b$a;Ljava/lang/String;Lt3/b;)V

    return-void
.end method

.method public static synthetic P1(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->q0(Lt3/b$a;I)V

    return-void
.end method

.method public static synthetic Q(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->V1(Lt3/b$a;ILt3/b;)V

    return-void
.end method

.method public static synthetic Q0(Lt3/b$a;Ljava/lang/Object;JLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt3/n1;->U1(Lt3/b$a;Ljava/lang/Object;JLt3/b;)V

    return-void
.end method

.method public static synthetic Q1(Lt3/b$a;Ls3/x2;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->h0(Lt3/b$a;Ls3/x2;)V

    return-void
.end method

.method public static synthetic R(Lt3/b$a;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->v1(Lt3/b$a;Lu4/q;Lt3/b;)V

    return-void
.end method

.method public static synthetic R0(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->A1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V

    return-void
.end method

.method public static synthetic R1(Lt3/b$a;Ls3/x2;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->e0(Lt3/b$a;Ls3/x2;)V

    return-void
.end method

.method public static synthetic S(Lt3/b$a;JILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt3/n1;->h2(Lt3/b$a;JILt3/b;)V

    return-void
.end method

.method public static synthetic S0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->e1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic S1(Lt3/b$a;ZILt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->t0(Lt3/b$a;ZI)V

    return-void
.end method

.method public static synthetic T(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->f2(Lt3/b$a;Lv3/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic T0(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lt3/n1;->d2(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V

    return-void
.end method

.method public static synthetic T1(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;Lt3/b;)V
    .locals 0

    invoke-interface {p4, p0, p1}, Lt3/b;->V(Lt3/b$a;I)V

    invoke-interface {p4, p0, p2, p3, p1}, Lt3/b;->s(Lt3/b$a;Ls3/b3$e;Ls3/b3$e;I)V

    return-void
.end method

.method public static synthetic U(Lt3/b$a;Ls3/o;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->t1(Lt3/b$a;Ls3/o;Lt3/b;)V

    return-void
.end method

.method public static synthetic U0(Lt3/b$a;Ls3/x2;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->R1(Lt3/b$a;Ls3/x2;Lt3/b;)V

    return-void
.end method

.method public static synthetic U1(Lt3/b$a;Ljava/lang/Object;JLt3/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lt3/b;->K(Lt3/b$a;Ljava/lang/Object;J)V

    return-void
.end method

.method public static synthetic V(Lt3/b$a;FLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->k2(Lt3/b$a;FLt3/b;)V

    return-void
.end method

.method public static synthetic V1(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->d(Lt3/b$a;I)V

    return-void
.end method

.method public static synthetic W(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->X1(Lt3/b$a;ZLt3/b;)V

    return-void
.end method

.method public static synthetic W1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->P(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic X(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->B1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic X1(Lt3/b$a;ZLt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->d0(Lt3/b$a;Z)V

    return-void
.end method

.method public static synthetic Y(Lt3/b$a;Ljava/util/List;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->r1(Lt3/b$a;Ljava/util/List;Lt3/b;)V

    return-void
.end method

.method public static synthetic Y1(Lt3/b$a;IILt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->O(Lt3/b$a;II)V

    return-void
.end method

.method public static synthetic Z(Lt3/b$a;Ls3/a3;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->N1(Lt3/b$a;Ls3/a3;Lt3/b;)V

    return-void
.end method

.method public static synthetic Z1(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->I(Lt3/b$a;I)V

    return-void
.end method

.method public static synthetic a0(Lt3/b$a;Ls3/u1;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->J1(Lt3/b$a;Ls3/u1;ILt3/b;)V

    return-void
.end method

.method public static synthetic a2(Lt3/b$a;Ls3/z3;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->Z(Lt3/b$a;Ls3/z3;)V

    return-void
.end method

.method public static synthetic b0(Lt3/b$a;Ls3/x2;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->Q1(Lt3/b$a;Ls3/x2;Lt3/b;)V

    return-void
.end method

.method public static synthetic b2(Lt3/b$a;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->i(Lt3/b$a;Lu4/q;)V

    return-void
.end method

.method public static synthetic c0(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->c2(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V

    return-void
.end method

.method public static synthetic c2(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->X(Lt3/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d0(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->G1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V

    return-void
.end method

.method public static synthetic d1(Lt3/b;Lp5/l;)V
    .locals 0

    return-void
.end method

.method public static synthetic d2(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V
    .locals 7

    invoke-interface {p6, p0, p1, p2, p3}, Lt3/b;->n0(Lt3/b$a;Ljava/lang/String;J)V

    move-object v0, p6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-interface/range {v0 .. v6}, Lt3/b;->a(Lt3/b$a;Ljava/lang/String;JJ)V

    const/4 v3, 0x2

    move-object v1, p6

    move-object v2, p0

    move-object v4, p1

    invoke-interface/range {v1 .. v6}, Lt3/b;->M(Lt3/b$a;ILjava/lang/String;J)V

    return-void
.end method

.method public static synthetic e0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->l2(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic e1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->q(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic e2(Lt3/b$a;Ljava/lang/String;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->v0(Lt3/b$a;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f0(Lt3/b$a;IILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->Y1(Lt3/b$a;IILt3/b;)V

    return-void
.end method

.method public static synthetic f1(Lt3/b$a;Lu3/e;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->D(Lt3/b$a;Lu3/e;)V

    return-void
.end method

.method public static synthetic f2(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lt3/b;->y(Lt3/b$a;Lv3/e;)V

    const/4 v0, 0x2

    invoke-interface {p2, p0, v0, p1}, Lt3/b;->H(Lt3/b$a;ILv3/e;)V

    return-void
.end method

.method public static synthetic g0(Lt3/b$a;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->b2(Lt3/b$a;Lu4/q;Lt3/b;)V

    return-void
.end method

.method public static synthetic g1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->v(Lt3/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic g2(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lt3/b;->w0(Lt3/b$a;Lv3/e;)V

    const/4 v0, 0x2

    invoke-interface {p2, p0, v0, p1}, Lt3/b;->u0(Lt3/b$a;ILv3/e;)V

    return-void
.end method

.method public static synthetic h0(Lt3/b$a;Lk4/a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->L1(Lt3/b$a;Lk4/a;Lt3/b;)V

    return-void
.end method

.method public static synthetic h1(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V
    .locals 7

    invoke-interface {p6, p0, p1, p2, p3}, Lt3/b;->x0(Lt3/b$a;Ljava/lang/String;J)V

    move-object v0, p6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-interface/range {v0 .. v6}, Lt3/b;->w(Lt3/b$a;Ljava/lang/String;JJ)V

    const/4 v3, 0x1

    move-object v1, p6

    move-object v2, p0

    move-object v4, p1

    invoke-interface/range {v1 .. v6}, Lt3/b;->M(Lt3/b$a;ILjava/lang/String;J)V

    return-void
.end method

.method public static synthetic h2(Lt3/b$a;JILt3/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lt3/b;->n(Lt3/b$a;JI)V

    return-void
.end method

.method public static synthetic i0(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->z1(Lt3/b$a;ILt3/b;)V

    return-void
.end method

.method public static synthetic i1(Lt3/b$a;Ljava/lang/String;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->l0(Lt3/b$a;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i2(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1}, Lt3/b;->p(Lt3/b$a;Ls3/m1;)V

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->C(Lt3/b$a;Ls3/m1;Lv3/i;)V

    const/4 p2, 0x2

    invoke-interface {p3, p0, p2, p1}, Lt3/b;->B(Lt3/b$a;ILs3/m1;)V

    return-void
.end method

.method public static synthetic j0(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->l1(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V

    return-void
.end method

.method public static synthetic j1(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lt3/b;->j(Lt3/b$a;Lv3/e;)V

    const/4 v0, 0x1

    invoke-interface {p2, p0, v0, p1}, Lt3/b;->H(Lt3/b$a;ILv3/e;)V

    return-void
.end method

.method public static synthetic j2(Lt3/b$a;Lq5/y;Lt3/b;)V
    .locals 6

    invoke-interface {p2, p0, p1}, Lt3/b;->o(Lt3/b$a;Lq5/y;)V

    iget v2, p1, Lq5/y;->h:I

    iget v3, p1, Lq5/y;->i:I

    iget v4, p1, Lq5/y;->j:I

    iget v5, p1, Lq5/y;->k:F

    move-object v0, p2

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Lt3/b;->Q(Lt3/b$a;IIIF)V

    return-void
.end method

.method public static synthetic k0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->w1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic k1(Lt3/b$a;Lv3/e;Lt3/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lt3/b;->m(Lt3/b$a;Lv3/e;)V

    const/4 v0, 0x1

    invoke-interface {p2, p0, v0, p1}, Lt3/b;->u0(Lt3/b$a;ILv3/e;)V

    return-void
.end method

.method public static synthetic k2(Lt3/b$a;FLt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->l(Lt3/b$a;F)V

    return-void
.end method

.method public static synthetic l0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->W1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic l1(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1}, Lt3/b;->g(Lt3/b$a;Ls3/m1;)V

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->G(Lt3/b$a;Ls3/m1;Lv3/i;)V

    const/4 p2, 0x1

    invoke-interface {p3, p0, p2, p1}, Lt3/b;->B(Lt3/b$a;ILs3/m1;)V

    return-void
.end method

.method public static synthetic l2(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->f(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic m0(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt3/n1;->F1(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V

    return-void
.end method

.method public static synthetic m1(Lt3/b$a;JLt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->k(Lt3/b$a;J)V

    return-void
.end method

.method private synthetic m2(Ls3/b3;Lt3/b;Lp5/l;)V
    .locals 2

    new-instance v0, Lt3/b$b;

    iget-object v1, p0, Lt3/n1;->e:Landroid/util/SparseArray;

    invoke-direct {v0, p3, v1}, Lt3/b$b;-><init>(Lp5/l;Landroid/util/SparseArray;)V

    invoke-interface {p2, p1, v0}, Lt3/b;->r(Ls3/b3;Lt3/b$b;)V

    return-void
.end method

.method public static synthetic n0(Lt3/b$a;IJJLt3/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lt3/n1;->q1(Lt3/b$a;IJJLt3/b;)V

    return-void
.end method

.method public static synthetic n1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->b0(Lt3/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic o0(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt3/n1;->T1(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;Lt3/b;)V

    return-void
.end method

.method public static synthetic o1(Lt3/b$a;IJJLt3/b;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lt3/b;->S(Lt3/b$a;IJJ)V

    return-void
.end method

.method public static synthetic p0(Lt3/b$a;Lu3/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->f1(Lt3/b$a;Lu3/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic p1(Lt3/b$a;Ls3/b3$b;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->U(Lt3/b$a;Ls3/b3$b;)V

    return-void
.end method

.method public static synthetic q0(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;ZLt3/b;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lt3/n1;->H1(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;ZLt3/b;)V

    return-void
.end method

.method public static synthetic q1(Lt3/b$a;IJJLt3/b;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lt3/b;->f0(Lt3/b$a;IJJ)V

    return-void
.end method

.method public static synthetic r0(Lt3/b$a;Ld5/e;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->s1(Lt3/b$a;Ld5/e;Lt3/b;)V

    return-void
.end method

.method public static synthetic r1(Lt3/b$a;Ljava/util/List;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->a0(Lt3/b$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s0(Lt3/b$a;Ls3/z1;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->K1(Lt3/b$a;Ls3/z1;Lt3/b;)V

    return-void
.end method

.method public static synthetic s1(Lt3/b$a;Ld5/e;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->c(Lt3/b$a;Ld5/e;)V

    return-void
.end method

.method public static synthetic t0(Lt3/b$a;IJLt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt3/n1;->C1(Lt3/b$a;IJLt3/b;)V

    return-void
.end method

.method public static synthetic t1(Lt3/b$a;Ls3/o;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->T(Lt3/b$a;Ls3/o;)V

    return-void
.end method

.method public static synthetic u0(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->n1(Lt3/b$a;Ljava/lang/Exception;Lt3/b;)V

    return-void
.end method

.method public static synthetic u1(Lt3/b$a;IZLt3/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lt3/b;->b(Lt3/b$a;IZ)V

    return-void
.end method

.method public static synthetic v0(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lt3/n1;->h1(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V

    return-void
.end method

.method public static synthetic v1(Lt3/b$a;Lu4/q;Lt3/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt3/b;->h(Lt3/b$a;Lu4/q;)V

    return-void
.end method

.method public static synthetic w0(Lt3/b$a;Ls3/b3$b;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->p1(Lt3/b$a;Ls3/b3$b;Lt3/b;)V

    return-void
.end method

.method public static synthetic w1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->e(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic x0(Lt3/b$a;Ljava/lang/String;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt3/n1;->e2(Lt3/b$a;Ljava/lang/String;Lt3/b;)V

    return-void
.end method

.method public static synthetic x1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->F(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic y0(Lt3/b$a;IJJLt3/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lt3/n1;->o1(Lt3/b$a;IJJLt3/b;)V

    return-void
.end method

.method public static synthetic y1(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lt3/b;->k0(Lt3/b$a;)V

    return-void
.end method

.method public static synthetic z0(Lt3/b$a;Lt3/b;)V
    .locals 0

    invoke-static {p0, p1}, Lt3/n1;->x1(Lt3/b$a;Lt3/b;)V

    return-void
.end method

.method public static synthetic z1(Lt3/b$a;ILt3/b;)V
    .locals 0

    invoke-interface {p2, p0}, Lt3/b;->z(Lt3/b$a;)V

    invoke-interface {p2, p0, p1}, Lt3/b;->p0(Lt3/b$a;I)V

    return-void
.end method


# virtual methods
.method public final A(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/f1;

    invoke-direct {p2, p1}, Lt3/f1;-><init>(Lt3/b$a;)V

    const/16 v0, 0x402

    invoke-virtual {p0, p1, v0, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public B(Lt3/b;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt3/n1;->f:Lp5/q;

    invoke-virtual {v0, p1}, Lp5/q;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final C(Ljava/util/List;Lu4/t$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu4/t$b;",
            ">;",
            "Lu4/t$b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    iget-object v1, p0, Lt3/n1;->g:Ls3/b3;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/b3;

    invoke-virtual {v0, p1, p2, v1}, Lt3/n1$a;->k(Ljava/util/List;Lu4/t$b;Ls3/b3;)V

    return-void
.end method

.method public D(Ls3/b3;Landroid/os/Looper;)V
    .locals 2

    iget-object v0, p0, Lt3/n1;->g:Ls3/b3;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-static {v0}, Lt3/n1$a;->a(Lt3/n1$a;)Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lp5/a;->f(Z)V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/b3;

    iput-object v0, p0, Lt3/n1;->g:Ls3/b3;

    iget-object v0, p0, Lt3/n1;->a:Lp5/d;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object v0

    iput-object v0, p0, Lt3/n1;->h:Lp5/n;

    iget-object v0, p0, Lt3/n1;->f:Lp5/q;

    new-instance v1, Lt3/h1;

    invoke-direct {v1, p0, p1}, Lt3/h1;-><init>(Lt3/n1;Ls3/b3;)V

    invoke-virtual {v0, p2, v1}, Lp5/q;->e(Landroid/os/Looper;Lp5/q$b;)Lp5/q;

    move-result-object p1

    iput-object p1, p0, Lt3/n1;->f:Lp5/q;

    return-void
.end method

.method public final E(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/j1;

    invoke-direct {p2, p1}, Lt3/j1;-><init>(Lt3/b$a;)V

    const/16 v0, 0x401

    invoke-virtual {p0, p1, v0, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final F(ILu4/t$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/u;

    invoke-direct {p2, p1, p3}, Lt3/u;-><init>(Lt3/b$a;Ljava/lang/Exception;)V

    const/16 p3, 0x400

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final G(ILu4/t$b;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/d;

    invoke-direct {p2, p1, p3}, Lt3/d;-><init>(Lt3/b$a;I)V

    const/16 p3, 0x3fe

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final H(ILu4/t$b;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/v0;

    invoke-direct {p2, p1, p3}, Lt3/v0;-><init>(Lt3/b$a;Lu4/q;)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final I(ILu4/t$b;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/t0;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lt3/t0;-><init>(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final J(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/r0;

    invoke-direct {p2, p1, p3, p4}, Lt3/r0;-><init>(Lt3/b$a;Lu4/n;Lu4/q;)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final V0()Lt3/b$a;
    .locals 1

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v0}, Lt3/n1$a;->d()Lu4/t$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object v0

    return-object v0
.end method

.method public final W0(Ls3/u3;ILu4/t$b;)Lt3/b$a;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    iget-object v1, v0, Lt3/n1;->a:Lp5/d;

    invoke-interface {v1}, Lp5/d;->b()J

    move-result-wide v2

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->F()Ls3/u3;

    move-result-object v1

    invoke-virtual {v4, v1}, Ls3/u3;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->A()I

    move-result v1

    if-ne v5, v1, :cond_1

    move v1, v7

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    const-wide/16 v9, 0x0

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lu4/s;->b()Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v1, :cond_2

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->z()I

    move-result v1

    iget v11, v6, Lu4/s;->b:I

    if-ne v1, v11, :cond_2

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->p()I

    move-result v1

    iget v11, v6, Lu4/s;->c:I

    if-ne v1, v11, :cond_2

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    if-eqz v7, :cond_6

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->H()J

    move-result-wide v9

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->s()J

    move-result-wide v7

    goto :goto_4

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lt3/n1;->c:Ls3/u3$d;

    invoke-virtual {v4, v5, v1}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v1

    invoke-virtual {v1}, Ls3/u3$d;->d()J

    move-result-wide v9

    :cond_6
    :goto_3
    move-wide v7, v9

    :goto_4
    iget-object v1, v0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v1}, Lt3/n1$a;->d()Lu4/t$b;

    move-result-object v11

    new-instance v16, Lt3/b$a;

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->F()Ls3/u3;

    move-result-object v9

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->A()I

    move-result v10

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->H()J

    move-result-wide v12

    iget-object v1, v0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->i()J

    move-result-wide v14

    move-object/from16 v1, v16

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-direct/range {v1 .. v15}, Lt3/b$a;-><init>(JLs3/u3;ILu4/t$b;JLs3/u3;ILu4/t$b;JJ)V

    return-object v16
.end method

.method public final X0(Lu4/t$b;)Lt3/b$a;
    .locals 3

    iget-object v0, p0, Lt3/n1;->g:Ls3/b3;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v1, p1}, Lt3/n1$a;->f(Lu4/t$b;)Ls3/u3;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lu4/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Lt3/n1;->b:Ls3/u3$b;

    invoke-virtual {v1, v0, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    invoke-virtual {p0, v1, v0, p1}, Lt3/n1;->W0(Ls3/u3;ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {p1}, Ls3/b3;->A()I

    move-result p1

    iget-object v1, p0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {v1}, Ls3/b3;->F()Ls3/u3;

    move-result-object v1

    invoke-virtual {v1}, Ls3/u3;->t()I

    move-result v2

    if-ge p1, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    sget-object v1, Ls3/u3;->h:Ls3/u3;

    :goto_3
    invoke-virtual {p0, v1, p1, v0}, Lt3/n1;->W0(Ls3/u3;ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    return-object p1
.end method

.method public final Y0()Lt3/b$a;
    .locals 1

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v0}, Lt3/n1$a;->e()Lu4/t$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object v0

    return-object v0
.end method

.method public final Z0(ILu4/t$b;)Lt3/b$a;
    .locals 3

    iget-object v0, p0, Lt3/n1;->g:Ls3/b3;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    iget-object v2, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v2, p2}, Lt3/n1$a;->f(Lu4/t$b;)Ls3/u3;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object v0, Ls3/u3;->h:Ls3/u3;

    invoke-virtual {p0, v0, p1, p2}, Lt3/n1;->W0(Ls3/u3;ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    iget-object p2, p0, Lt3/n1;->g:Ls3/b3;

    invoke-interface {p2}, Ls3/b3;->F()Ls3/u3;

    move-result-object p2

    invoke-virtual {p2}, Ls3/u3;->t()I

    move-result v2

    if-ge p1, v2, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    sget-object p2, Ls3/u3;->h:Ls3/u3;

    :goto_3
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lt3/n1;->W0(Ls3/u3;ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/t;

    invoke-direct {v1, v0, p1}, Lt3/t;-><init>(Lt3/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x3f6

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final a1()Lt3/b$a;
    .locals 1

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v0}, Lt3/n1$a;->g()Lu4/t$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/w;

    invoke-direct {v1, v0, p1}, Lt3/w;-><init>(Lt3/b$a;Ljava/lang/String;)V

    const/16 p1, 0x3fb

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final b1()Lt3/b$a;
    .locals 1

    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    invoke-virtual {v0}, Lt3/n1$a;->h()Lu4/t$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ls3/m1;Lv3/i;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/f0;

    invoke-direct {v1, v0, p1, p2}, Lt3/f0;-><init>(Lt3/b$a;Ls3/m1;Lv3/i;)V

    const/16 p1, 0x3f9

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final c1(Ls3/x2;)Lt3/b$a;
    .locals 1

    instance-of v0, p1, Ls3/q;

    if-eqz v0, :cond_0

    check-cast p1, Ls3/q;

    iget-object p1, p1, Ls3/q;->u:Lu4/s;

    if-eqz p1, :cond_0

    new-instance v0, Lu4/t$b;

    invoke-direct {v0, p1}, Lu4/t$b;-><init>(Lu4/s;)V

    invoke-virtual {p0, v0}, Lt3/n1;->X0(Lu4/t$b;)Lt3/b$a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;JJ)V
    .locals 9

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v7

    new-instance v8, Lt3/a0;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lt3/a0;-><init>(Lt3/b$a;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f8

    invoke-virtual {p0, v7, p1, v8}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final e(Ls3/m1;Lv3/i;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/g0;

    invoke-direct {v1, v0, p1, p2}, Lt3/g0;-><init>(Lt3/b$a;Ls3/m1;Lv3/i;)V

    const/16 p1, 0x3f1

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final f(Lv3/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/a1;

    invoke-direct {v1, v0, p1}, Lt3/a1;-><init>(Lt3/b$a;Lv3/e;)V

    const/16 p1, 0x3f7

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/x;

    invoke-direct {v1, v0, p1}, Lt3/x;-><init>(Lt3/b$a;Ljava/lang/String;)V

    const/16 p1, 0x3f4

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final h(Ljava/lang/String;JJ)V
    .locals 9

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v7

    new-instance v8, Lt3/z;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lt3/z;-><init>(Lt3/b$a;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f0

    invoke-virtual {p0, v7, p1, v8}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final i(IJ)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->a1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/i;

    invoke-direct {v1, v0, p1, p2, p3}, Lt3/i;-><init>(Lt3/b$a;IJ)V

    const/16 p1, 0x3fa

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final j(Lv3/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->a1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/y0;

    invoke-direct {v1, v0, p1}, Lt3/y0;-><init>(Lt3/b$a;Lv3/e;)V

    const/16 p1, 0x3f5

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final k(Ljava/lang/Object;J)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/v;

    invoke-direct {v1, v0, p1, p2, p3}, Lt3/v;-><init>(Lt3/b$a;Ljava/lang/Object;J)V

    const/16 p1, 0x1a

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final l(J)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/o;

    invoke-direct {v1, v0, p1, p2}, Lt3/o;-><init>(Lt3/b$a;J)V

    const/16 p1, 0x3f2

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final m(Lv3/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/z0;

    invoke-direct {v1, v0, p1}, Lt3/z0;-><init>(Lt3/b$a;Lv3/e;)V

    const/16 p1, 0x3ef

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final n(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/r;

    invoke-direct {v1, v0, p1}, Lt3/r;-><init>(Lt3/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x405

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final n2()V
    .locals 3

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/y;

    invoke-direct {v1, v0}, Lt3/y;-><init>(Lt3/b$a;)V

    const/16 v2, 0x404

    invoke-virtual {p0, v0, v2, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    iget-object v0, p0, Lt3/n1;->f:Lp5/q;

    invoke-virtual {v0}, Lp5/q;->j()V

    return-void
.end method

.method public final o(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/s;

    invoke-direct {v1, v0, p1}, Lt3/s;-><init>(Lt3/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x406

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final o2(Lt3/b$a;ILp5/q$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/b$a;",
            "I",
            "Lp5/q$a<",
            "Lt3/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lt3/n1;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lt3/n1;->f:Lp5/q;

    invoke-virtual {p1, p2, p3}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public final onAudioAttributesChanged(Lu3/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/p0;

    invoke-direct {v1, v0, p1}, Lt3/p0;-><init>(Lt3/b$a;Lu3/e;)V

    const/16 p1, 0x14

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onAvailableCommandsChanged(Ls3/b3$b;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/n0;

    invoke-direct {v1, v0, p1}, Lt3/n0;-><init>(Lt3/b$a;Ls3/b3$b;)V

    const/16 p1, 0xd

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onCues(Ld5/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/q;

    invoke-direct {v1, v0, p1}, Lt3/q;-><init>(Lt3/b$a;Ld5/e;)V

    const/16 p1, 0x1b

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onCues(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/b0;

    invoke-direct {v1, v0, p1}, Lt3/b0;-><init>(Lt3/b$a;Ljava/util/List;)V

    const/16 p1, 0x1b

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onDeviceInfoChanged(Ls3/o;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/e0;

    invoke-direct {v1, v0, p1}, Lt3/e0;-><init>(Lt3/b$a;Ls3/o;)V

    const/16 p1, 0x1d

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onDeviceVolumeChanged(IZ)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/m;

    invoke-direct {v1, v0, p1, p2}, Lt3/m;-><init>(Lt3/b$a;IZ)V

    const/16 p1, 0x1e

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onEvents(Ls3/b3;Ls3/b3$c;)V
    .locals 0

    return-void
.end method

.method public final onIsLoadingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/d1;

    invoke-direct {v1, v0, p1}, Lt3/d1;-><init>(Lt3/b$a;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onIsPlayingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/b1;

    invoke-direct {v1, v0, p1}, Lt3/b1;-><init>(Lt3/b$a;Z)V

    const/4 p1, 0x7

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public final onMediaItemTransition(Ls3/u1;I)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/h0;

    invoke-direct {v1, v0, p1, p2}, Lt3/h0;-><init>(Lt3/b$a;Ls3/u1;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onMediaMetadataChanged(Ls3/z1;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/i0;

    invoke-direct {v1, v0, p1}, Lt3/i0;-><init>(Lt3/b$a;Ls3/z1;)V

    const/16 p1, 0xe

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onMetadata(Lk4/a;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/c0;

    invoke-direct {v1, v0, p1}, Lt3/c0;-><init>(Lt3/b$a;Lk4/a;)V

    const/16 p1, 0x1c

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/e1;

    invoke-direct {v1, v0, p1, p2}, Lt3/e1;-><init>(Lt3/b$a;ZI)V

    const/4 p1, 0x5

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlaybackParametersChanged(Ls3/a3;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/m0;

    invoke-direct {v1, v0, p1}, Lt3/m0;-><init>(Lt3/b$a;Ls3/a3;)V

    const/16 p1, 0xc

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/e;

    invoke-direct {v1, v0, p1}, Lt3/e;-><init>(Lt3/b$a;I)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlaybackSuppressionReasonChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/f;

    invoke-direct {v1, v0, p1}, Lt3/f;-><init>(Lt3/b$a;I)V

    const/4 p1, 0x6

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlayerError(Ls3/x2;)V
    .locals 2

    invoke-virtual {p0, p1}, Lt3/n1;->c1(Ls3/x2;)Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/k0;

    invoke-direct {v1, v0, p1}, Lt3/k0;-><init>(Lt3/b$a;Ls3/x2;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onPlayerErrorChanged(Ls3/x2;)V
    .locals 2

    invoke-virtual {p0, p1}, Lt3/n1;->c1(Ls3/x2;)Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/l0;

    invoke-direct {v1, v0, p1}, Lt3/l0;-><init>(Lt3/b$a;Ls3/x2;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onPlayerStateChanged(ZI)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/g1;

    invoke-direct {v1, v0, p1, p2}, Lt3/g1;-><init>(Lt3/b$a;ZI)V

    const/4 p1, -0x1

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onPositionDiscontinuity(I)V
    .locals 0

    return-void
.end method

.method public final onPositionDiscontinuity(Ls3/b3$e;Ls3/b3$e;I)V
    .locals 3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt3/n1;->i:Z

    :cond_0
    iget-object v0, p0, Lt3/n1;->d:Lt3/n1$a;

    iget-object v1, p0, Lt3/n1;->g:Ls3/b3;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/b3;

    invoke-virtual {v0, v1}, Lt3/n1$a;->j(Ls3/b3;)V

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    const/16 v1, 0xb

    new-instance v2, Lt3/l;

    invoke-direct {v2, v0, p3, p1, p2}, Lt3/l;-><init>(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;)V

    invoke-virtual {p0, v0, v1, v2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public final onRepeatModeChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/m1;

    invoke-direct {v1, v0, p1}, Lt3/m1;-><init>(Lt3/b$a;I)V

    const/16 p1, 0x8

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onSeekProcessed()V
    .locals 3

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/u0;

    invoke-direct {v1, v0}, Lt3/u0;-><init>(Lt3/b$a;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onSkipSilenceEnabledChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/c1;

    invoke-direct {v1, v0, p1}, Lt3/c1;-><init>(Lt3/b$a;Z)V

    const/16 p1, 0x17

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/h;

    invoke-direct {v1, v0, p1, p2}, Lt3/h;-><init>(Lt3/b$a;II)V

    const/16 p1, 0x18

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onTimelineChanged(Ls3/u3;I)V
    .locals 1

    iget-object p1, p0, Lt3/n1;->d:Lt3/n1$a;

    iget-object v0, p0, Lt3/n1;->g:Ls3/b3;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/b3;

    invoke-virtual {p1, v0}, Lt3/n1$a;->l(Ls3/b3;)V

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object p1

    new-instance v0, Lt3/g;

    invoke-direct {v0, p1, p2}, Lt3/g;-><init>(Lt3/b$a;I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public onTracksChanged(Ls3/z3;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/o0;

    invoke-direct {v1, v0, p1}, Lt3/o0;-><init>(Lt3/b$a;Ls3/z3;)V

    const/4 p1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onVideoSizeChanged(Lq5/y;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/d0;

    invoke-direct {v1, v0, p1}, Lt3/d0;-><init>(Lt3/b$a;Lq5/y;)V

    const/16 p1, 0x19

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final onVolumeChanged(F)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/l1;

    invoke-direct {v1, v0, p1}, Lt3/l1;-><init>(Lt3/b$a;F)V

    const/16 p1, 0x16

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final p(Lv3/e;)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->a1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/x0;

    invoke-direct {v1, v0, p1}, Lt3/x0;-><init>(Lt3/b$a;Lv3/e;)V

    const/16 p1, 0x3fc

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final q(IJJ)V
    .locals 9

    invoke-virtual {p0}, Lt3/n1;->b1()Lt3/b$a;

    move-result-object v7

    new-instance v8, Lt3/k;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lt3/k;-><init>(Lt3/b$a;IJJ)V

    const/16 p1, 0x3f3

    invoke-virtual {p0, v7, p1, v8}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final r(JI)V
    .locals 2

    invoke-virtual {p0}, Lt3/n1;->a1()Lt3/b$a;

    move-result-object v0

    new-instance v1, Lt3/p;

    invoke-direct {v1, v0, p1, p2, p3}, Lt3/p;-><init>(Lt3/b$a;JI)V

    const/16 p1, 0x3fd

    invoke-virtual {p0, v0, p1, v1}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lt3/n1;->h:Lp5/n;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/n;

    new-instance v1, Lt3/c;

    invoke-direct {v1, p0}, Lt3/c;-><init>(Lt3/n1;)V

    invoke-interface {v0, v1}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final s(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/j0;

    invoke-direct {p2, p1}, Lt3/j0;-><init>(Lt3/b$a;)V

    const/16 v0, 0x3ff

    invoke-virtual {p0, p1, v0, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final t(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/n;

    invoke-direct {p2, p1}, Lt3/n;-><init>(Lt3/b$a;)V

    const/16 v0, 0x403

    invoke-virtual {p0, p1, v0, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final u(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/q0;

    invoke-direct {p2, p1, p3, p4}, Lt3/q0;-><init>(Lt3/b$a;Lu4/n;Lu4/q;)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final v(IJJ)V
    .locals 9

    invoke-virtual {p0}, Lt3/n1;->Y0()Lt3/b$a;

    move-result-object v7

    new-instance v8, Lt3/j;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lt3/j;-><init>(Lt3/b$a;IJJ)V

    const/16 p1, 0x3ee

    invoke-virtual {p0, v7, p1, v8}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final w()V
    .locals 3

    iget-boolean v0, p0, Lt3/n1;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lt3/n1;->V0()Lt3/b$a;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lt3/n1;->i:Z

    const/4 v1, -0x1

    new-instance v2, Lt3/k1;

    invoke-direct {v2, v0}, Lt3/k1;-><init>(Lt3/b$a;)V

    invoke-virtual {p0, v0, v1, v2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    :cond_0
    return-void
.end method

.method public final y(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/s0;

    invoke-direct {p2, p1, p3, p4}, Lt3/s0;-><init>(Lt3/b$a;Lu4/n;Lu4/q;)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method

.method public final z(ILu4/t$b;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt3/n1;->Z0(ILu4/t$b;)Lt3/b$a;

    move-result-object p1

    new-instance p2, Lt3/w0;

    invoke-direct {p2, p1, p3}, Lt3/w0;-><init>(Lt3/b$a;Lu4/q;)V

    const/16 p3, 0x3ed

    invoke-virtual {p0, p1, p3, p2}, Lt3/n1;->o2(Lt3/b$a;ILp5/q$a;)V

    return-void
.end method
