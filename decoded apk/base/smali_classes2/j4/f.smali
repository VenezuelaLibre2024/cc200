.class public final synthetic Lj4/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lj4/g;


# direct methods
.method public synthetic constructor <init>(Lj4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/f;->h:Lj4/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lj4/f;->h:Lj4/g;

    invoke-static {v0}, Lj4/g;->a(Lj4/g;)V

    return-void
.end method
