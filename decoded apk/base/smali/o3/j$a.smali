.class public final Lo3/j$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lo3/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/j;

    invoke-direct {v0}, Lo3/j;-><init>()V

    sput-object v0, Lo3/j$a;->a:Lo3/j;

    return-void
.end method

.method public static synthetic a()Lo3/j;
    .locals 1

    sget-object v0, Lo3/j$a;->a:Lo3/j;

    return-object v0
.end method
