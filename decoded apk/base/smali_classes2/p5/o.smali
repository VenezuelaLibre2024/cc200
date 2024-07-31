.class public final synthetic Lp5/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic h:Lp5/q;


# direct methods
.method public synthetic constructor <init>(Lp5/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/o;->h:Lp5/q;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lp5/o;->h:Lp5/q;

    invoke-static {v0, p1}, Lp5/q;->b(Lp5/q;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
