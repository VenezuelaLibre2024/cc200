.class public Lhb/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lhb/l;


# direct methods
.method public constructor <init>(Lhb/l;)V
    .locals 0

    iput-object p1, p0, Lhb/l$a;->h:Lhb/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    sget v1, Lma/k;->e:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lhb/l$a;->h:Lhb/l;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lhb/t;

    invoke-static {v0, p1}, Lhb/l;->a(Lhb/l;Lhb/t;)V

    goto :goto_0

    :cond_0
    sget p1, Lma/k;->i:I

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lhb/l$a;->h:Lhb/l;

    invoke-static {p1}, Lhb/l;->b(Lhb/l;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
