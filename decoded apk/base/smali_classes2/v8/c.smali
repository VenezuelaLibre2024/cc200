.class public final synthetic Lv8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv8/f;


# direct methods
.method public synthetic constructor <init>(Lv8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/c;->a:Lv8/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv8/c;->a:Lv8/f;

    invoke-static {v0}, Lv8/f;->d(Lv8/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
