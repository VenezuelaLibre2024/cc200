.class public Landroidx/fragment/app/x$b;
.super Landroidx/activity/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/x;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/x;Z)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/x$b;->a:Landroidx/fragment/app/x;

    invoke-direct {p0, p2}, Landroidx/activity/l;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x$b;->a:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->E0()V

    return-void
.end method
