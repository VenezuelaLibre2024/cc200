.class public final synthetic Lw2/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/OnNmeaMessageListener;


# instance fields
.field public final synthetic a:Lw2/v;


# direct methods
.method public synthetic constructor <init>(Lw2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/u;->a:Lw2/v;

    return-void
.end method


# virtual methods
.method public final onNmeaMessage(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lw2/u;->a:Lw2/v;

    invoke-static {v0, p1, p2, p3}, Lw2/v;->a(Lw2/v;Ljava/lang/String;J)V

    return-void
.end method
