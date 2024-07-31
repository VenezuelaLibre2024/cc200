.class public final Lee/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lee/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Lee/d$a;

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lee/d$a;

    invoke-direct {v0}, Lee/d$a;-><init>()V

    sput-object v0, Lee/d$a;->a:Lee/d$a;

    const-string v0, "kotlinx.coroutines.channels.defaultBuffer"

    const/16 v1, 0x40

    const/4 v2, 0x1

    const v3, 0x7ffffffe

    invoke-static {v0, v1, v2, v3}, Lhe/m0;->b(Ljava/lang/String;III)I

    move-result v0

    sput v0, Lee/d$a;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget v0, Lee/d$a;->b:I

    return v0
.end method
