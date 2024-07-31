.class public abstract Li7/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/n$b;
    }
.end annotation


# static fields
.field public static final a:Li7/n;

.field public static final b:Li7/n;

.field public static final c:Li7/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/n$a;

    invoke-direct {v0}, Li7/n$a;-><init>()V

    sput-object v0, Li7/n;->a:Li7/n;

    new-instance v0, Li7/n$b;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Li7/n$b;-><init>(I)V

    sput-object v0, Li7/n;->b:Li7/n;

    new-instance v0, Li7/n$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li7/n$b;-><init>(I)V

    sput-object v0, Li7/n;->c:Li7/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li7/n$a;)V
    .locals 0

    invoke-direct {p0}, Li7/n;-><init>()V

    return-void
.end method

.method public static synthetic a()Li7/n;
    .locals 1

    sget-object v0, Li7/n;->b:Li7/n;

    return-object v0
.end method

.method public static synthetic b()Li7/n;
    .locals 1

    sget-object v0, Li7/n;->c:Li7/n;

    return-object v0
.end method

.method public static synthetic c()Li7/n;
    .locals 1

    sget-object v0, Li7/n;->a:Li7/n;

    return-object v0
.end method

.method public static j()Li7/n;
    .locals 1

    sget-object v0, Li7/n;->a:Li7/n;

    return-object v0
.end method


# virtual methods
.method public abstract d(II)Li7/n;
.end method

.method public abstract e(JJ)Li7/n;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Li7/n;"
        }
    .end annotation
.end method

.method public abstract g(ZZ)Li7/n;
.end method

.method public abstract h(ZZ)Li7/n;
.end method

.method public abstract i()I
.end method
