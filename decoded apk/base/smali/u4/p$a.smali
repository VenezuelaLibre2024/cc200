.class public final Lu4/p$a;
.super Lu4/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final p:Ljava/lang/Object;


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu4/p$a;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lu4/l;-><init>(Ls3/u3;)V

    iput-object p2, p0, Lu4/p$a;->n:Ljava/lang/Object;

    iput-object p3, p0, Lu4/p$a;->o:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic w(Lu4/p$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lu4/p$a;->o:Ljava/lang/Object;

    return-object p0
.end method

.method public static y(Ls3/u1;)Lu4/p$a;
    .locals 3

    new-instance v0, Lu4/p$a;

    new-instance v1, Lu4/p$b;

    invoke-direct {v1, p0}, Lu4/p$b;-><init>(Ls3/u1;)V

    sget-object p0, Ls3/u3$d;->y:Ljava/lang/Object;

    sget-object v2, Lu4/p$a;->p:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lu4/p$a;-><init>(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static z(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)Lu4/p$a;
    .locals 1

    new-instance v0, Lu4/p$a;

    invoke-direct {v0, p0, p1, p2}, Lu4/p$a;-><init>(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lu4/l;->m:Ls3/u3;

    sget-object v1, Lu4/p$a;->p:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lu4/p$a;->o:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-virtual {v0, p1}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public k(ILs3/u3$b;Z)Ls3/u3$b;
    .locals 1

    iget-object v0, p0, Lu4/l;->m:Ls3/u3;

    invoke-virtual {v0, p1, p2, p3}, Ls3/u3;->k(ILs3/u3$b;Z)Ls3/u3$b;

    iget-object p1, p2, Ls3/u3$b;->i:Ljava/lang/Object;

    iget-object v0, p0, Lu4/p$a;->o:Ljava/lang/Object;

    invoke-static {p1, v0}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lu4/p$a;->p:Ljava/lang/Object;

    iput-object p1, p2, Ls3/u3$b;->i:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public q(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu4/l;->m:Ls3/u3;

    invoke-virtual {v0, p1}, Ls3/u3;->q(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lu4/p$a;->o:Ljava/lang/Object;

    invoke-static {p1, v0}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lu4/p$a;->p:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public s(ILs3/u3$d;J)Ls3/u3$d;
    .locals 1

    iget-object v0, p0, Lu4/l;->m:Ls3/u3;

    invoke-virtual {v0, p1, p2, p3, p4}, Ls3/u3;->s(ILs3/u3$d;J)Ls3/u3$d;

    iget-object p1, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object p3, p0, Lu4/p$a;->n:Ljava/lang/Object;

    invoke-static {p1, p3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ls3/u3$d;->y:Ljava/lang/Object;

    iput-object p1, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public x(Ls3/u3;)Lu4/p$a;
    .locals 3

    new-instance v0, Lu4/p$a;

    iget-object v1, p0, Lu4/p$a;->n:Ljava/lang/Object;

    iget-object v2, p0, Lu4/p$a;->o:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lu4/p$a;-><init>(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
