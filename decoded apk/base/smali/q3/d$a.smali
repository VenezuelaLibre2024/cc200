.class public final Lq3/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lq3/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq3/d;

    invoke-direct {v0}, Lq3/d;-><init>()V

    sput-object v0, Lq3/d$a;->a:Lq3/d;

    return-void
.end method

.method public static synthetic a()Lq3/d;
    .locals 1

    sget-object v0, Lq3/d$a;->a:Lq3/d;

    return-object v0
.end method
