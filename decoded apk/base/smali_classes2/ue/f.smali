.class public final synthetic Lue/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lue/g;


# direct methods
.method public synthetic constructor <init>(Lue/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lue/f;->h:Lue/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lue/f;->h:Lue/g;

    invoke-static {v0}, Lue/g;->a(Lue/g;)V

    return-void
.end method
