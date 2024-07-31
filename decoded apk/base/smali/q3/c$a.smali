.class public final Lq3/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lq3/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq3/c;

    invoke-direct {v0}, Lq3/c;-><init>()V

    sput-object v0, Lq3/c$a;->a:Lq3/c;

    return-void
.end method

.method public static synthetic a()Lq3/c;
    .locals 1

    sget-object v0, Lq3/c$a;->a:Lq3/c;

    return-object v0
.end method
