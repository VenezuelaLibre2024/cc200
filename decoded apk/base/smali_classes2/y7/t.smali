.class public final synthetic Ly7/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/Map$Entry;

.field public final synthetic i:Lu8/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lu8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/t;->h:Ljava/util/Map$Entry;

    iput-object p2, p0, Ly7/t;->i:Lu8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly7/t;->h:Ljava/util/Map$Entry;

    iget-object v1, p0, Ly7/t;->i:Lu8/a;

    invoke-static {v0, v1}, Ly7/u;->e(Ljava/util/Map$Entry;Lu8/a;)V

    return-void
.end method
