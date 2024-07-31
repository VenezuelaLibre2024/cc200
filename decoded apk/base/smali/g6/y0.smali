.class public final synthetic Lg6/y0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg6/l;

.field public final synthetic i:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Lg6/l;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/y0;->h:Lg6/l;

    iput-object p2, p0, Lg6/y0;->i:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg6/y0;->h:Lg6/l;

    iget-object v1, p0, Lg6/y0;->i:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lg6/l;->c(Landroid/os/IBinder;)V

    return-void
.end method
