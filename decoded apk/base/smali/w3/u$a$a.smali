.class public final Lw3/u$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lw3/u;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lw3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/u$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lw3/u$a$a;->b:Lw3/u;

    return-void
.end method
