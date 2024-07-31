.class public final synthetic Landroidx/activity/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lsd/a;


# direct methods
.method public synthetic constructor <init>(Lsd/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/m;->a:Lsd/a;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/m;->a:Lsd/a;

    invoke-static {v0}, Landroidx/activity/OnBackPressedDispatcher$c;->a(Lsd/a;)V

    return-void
.end method
