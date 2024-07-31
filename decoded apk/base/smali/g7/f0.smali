.class public final synthetic Lg7/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lg7/d;


# direct methods
.method public synthetic constructor <init>(Lg7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/f0;->a:Lg7/d;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lg7/f0;->a:Lg7/d;

    invoke-static {v0}, Lg7/d;->k(Lg7/d;)V

    return-void
.end method
