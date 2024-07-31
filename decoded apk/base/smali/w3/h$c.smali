.class public Lw3/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/b0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lw3/h;


# direct methods
.method public constructor <init>(Lw3/h;)V
    .locals 0

    iput-object p1, p0, Lw3/h$c;->a:Lw3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw3/h;Lw3/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/h$c;-><init>(Lw3/h;)V

    return-void
.end method


# virtual methods
.method public a(Lw3/b0;[BII[B)V
    .locals 0

    iget-object p1, p0, Lw3/h$c;->a:Lw3/h;

    iget-object p1, p1, Lw3/h;->z:Lw3/h$d;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw3/h$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
