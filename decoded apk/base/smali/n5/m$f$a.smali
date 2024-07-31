.class public Ln5/m$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/m$f;->b(Ln5/m;Landroid/os/Looper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln5/m;


# direct methods
.method public constructor <init>(Ln5/m$f;Ln5/m;)V
    .locals 0

    iput-object p2, p0, Ln5/m$f$a;->a:Ln5/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSpatializerAvailableChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Ln5/m$f$a;->a:Ln5/m;

    invoke-static {p1}, Ln5/m;->x(Ln5/m;)V

    return-void
.end method

.method public onSpatializerEnabledChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Ln5/m$f$a;->a:Ln5/m;

    invoke-static {p1}, Ln5/m;->x(Ln5/m;)V

    return-void
.end method
