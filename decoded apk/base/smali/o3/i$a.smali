.class public final Lo3/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lo3/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/i;

    invoke-direct {v0}, Lo3/i;-><init>()V

    sput-object v0, Lo3/i$a;->a:Lo3/i;

    return-void
.end method

.method public static synthetic a()Lo3/i;
    .locals 1

    sget-object v0, Lo3/i$a;->a:Lo3/i;

    return-object v0
.end method
