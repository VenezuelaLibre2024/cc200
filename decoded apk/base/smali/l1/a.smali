.class public abstract Ll1/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/a$a;,
        Ll1/a$b;
    }
.end annotation


# static fields
.field public static final a:Ll1/a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll1/a$b;-><init>(Ltd/g;)V

    sput-object v0, Ll1/a;->a:Ll1/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Ll1/a;
    .locals 1

    sget-object v0, Ll1/a;->a:Ll1/a$b;

    invoke-virtual {v0, p0}, Ll1/a$b;->a(Landroid/content/Context;)Ll1/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll7/f<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Landroid/net/Uri;)Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end method
