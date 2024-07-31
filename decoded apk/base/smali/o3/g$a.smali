.class public final Lo3/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lo3/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/g;

    invoke-direct {v0}, Lo3/g;-><init>()V

    sput-object v0, Lo3/g$a;->a:Lo3/g;

    return-void
.end method

.method public static synthetic a()Lo3/g;
    .locals 1

    sget-object v0, Lo3/g$a;->a:Lo3/g;

    return-object v0
.end method
