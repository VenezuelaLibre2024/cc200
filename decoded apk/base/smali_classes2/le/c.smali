.class public final Lle/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "NO_OWNER"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lle/c;->a:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "ALREADY_LOCKED_BY_OWNER"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lle/c;->b:Lhe/l0;

    return-void
.end method

.method public static final a(Z)Lle/a;
    .locals 1

    new-instance v0, Lle/b;

    invoke-direct {v0, p0}, Lle/b;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)Lle/a;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lle/c;->a(Z)Lle/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lhe/l0;
    .locals 1

    sget-object v0, Lle/c;->a:Lhe/l0;

    return-object v0
.end method
