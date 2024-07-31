.class public Li9/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/b$b;
    }
.end annotation


# static fields
.field public static final a:Li9/a;

.field public static volatile b:Li9/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/b$b;-><init>(Li9/b$a;)V

    sput-object v0, Li9/b;->a:Li9/a;

    sput-object v0, Li9/b;->b:Li9/a;

    return-void
.end method

.method public static a()Li9/a;
    .locals 1

    sget-object v0, Li9/b;->b:Li9/a;

    return-object v0
.end method
