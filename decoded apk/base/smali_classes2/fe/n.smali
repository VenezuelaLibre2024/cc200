.class public final Lfe/n;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfe/n;->a:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfe/n;->b:Lhe/l0;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)Lfe/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lfe/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfe/m;

    if-nez p0, :cond_0

    sget-object p0, Lge/h;->a:Lhe/l0;

    :cond_0
    invoke-direct {v0, p0}, Lfe/m;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()Lhe/l0;
    .locals 1

    sget-object v0, Lfe/n;->a:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic c()Lhe/l0;
    .locals 1

    sget-object v0, Lfe/n;->b:Lhe/l0;

    return-object v0
.end method
