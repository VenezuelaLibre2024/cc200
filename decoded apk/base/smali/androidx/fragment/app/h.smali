.class public final synthetic Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj0/a;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/h;->a:Landroidx/fragment/app/j;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/h;->a:Landroidx/fragment/app/j;

    check-cast p1, Landroid/content/Intent;

    invoke-static {v0, p1}, Landroidx/fragment/app/j;->d(Landroidx/fragment/app/j;Landroid/content/Intent;)V

    return-void
.end method