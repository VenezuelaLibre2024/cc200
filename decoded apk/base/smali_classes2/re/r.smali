.class public final synthetic Lre/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/s$b;


# instance fields
.field public final synthetic a:Lre/s;


# direct methods
.method public synthetic constructor <init>(Lre/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/r;->a:Lre/s;

    return-void
.end method


# virtual methods
.method public final a(Lre/e;)Lre/s;
    .locals 1

    iget-object v0, p0, Lre/r;->a:Lre/s;

    invoke-static {v0, p1}, Lre/s;->a(Lre/s;Lre/e;)Lre/s;

    move-result-object p1

    return-object p1
.end method
