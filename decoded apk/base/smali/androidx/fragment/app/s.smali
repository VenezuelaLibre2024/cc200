.class public final synthetic Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/x;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/x;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/x;

    invoke-static {v0}, Landroidx/fragment/app/x;->e(Landroidx/fragment/app/x;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
