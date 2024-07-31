.class public abstract Lre/c0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lre/x;[B)Lre/c0;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lre/c0;->d(Lre/x;[BII)Lre/c0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lre/x;[BII)Lre/c0;
    .locals 7

    const-string v0, "content == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lse/e;->e(JJJ)V

    new-instance v0, Lre/c0$a;

    invoke-direct {v0, p0, p3, p1, p2}, Lre/c0$a;-><init>(Lre/x;I[BI)V

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Lre/x;
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract g(Lbf/d;)V
.end method
