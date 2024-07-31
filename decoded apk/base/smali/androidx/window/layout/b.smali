.class public final synthetic Landroidx/window/layout/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj0/a;


# instance fields
.field public final synthetic a:Lee/d;


# direct methods
.method public synthetic constructor <init>(Lee/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/b;->a:Lee/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/window/layout/b;->a:Lee/d;

    check-cast p1, Landroidx/window/layout/WindowLayoutInfo;

    invoke-static {v0, p1}, Landroidx/window/layout/WindowInfoTrackerImpl$windowLayoutInfo$1;->a(Lee/d;Landroidx/window/layout/WindowLayoutInfo;)V

    return-void
.end method
