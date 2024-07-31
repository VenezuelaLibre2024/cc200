.class public final synthetic Lw2/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lw2/w;


# direct methods
.method public synthetic constructor <init>(Lw2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/i;->a:Lw2/w;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw2/i;->a:Lw2/w;

    check-cast p1, Landroid/location/Location;

    invoke-interface {v0, p1}, Lw2/w;->a(Landroid/location/Location;)V

    return-void
.end method
