.class public abstract Lgc/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/f$b;
    }
.end annotation


# static fields
.field public static final a:Lwb/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lgc/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lgc/f;->a:Lwb/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgc/f$a;)V
    .locals 0

    invoke-direct {p0}, Lgc/f;-><init>()V

    return-void
.end method

.method public static synthetic a()Lwb/e;
    .locals 1

    sget-object v0, Lgc/f;->a:Lwb/e;

    return-object v0
.end method

.method public static b(II)Lgc/f;
    .locals 2

    new-instance v0, Lgc/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lgc/f$b;-><init>(IILgc/f$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract c(J)Z
.end method
