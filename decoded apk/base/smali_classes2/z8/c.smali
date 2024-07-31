.class public final synthetic Lz8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz8/g;


# direct methods
.method public synthetic constructor <init>(Lz8/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/c;->h:Lz8/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz8/c;->h:Lz8/g;

    invoke-static {v0}, Lz8/g;->c(Lz8/g;)V

    return-void
.end method
