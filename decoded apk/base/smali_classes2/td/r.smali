.class public abstract Ltd/r;
.super Ltd/t;
.source ""

# interfaces
.implements Lyd/g;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    sget-object v1, Ltd/c;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ltd/t;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lyd/b;
    .locals 1

    invoke-static {p0}, Ltd/x;->e(Ltd/r;)Lyd/g;

    move-result-object v0

    return-object v0
.end method

.method public d()Lyd/g$a;
    .locals 1

    invoke-virtual {p0}, Ltd/t;->c()Lyd/h;

    move-result-object v0

    check-cast v0, Lyd/g;

    invoke-interface {v0}, Lyd/g;->d()Lyd/g$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1, p2}, Lyd/g;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
