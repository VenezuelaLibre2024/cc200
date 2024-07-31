.class public final synthetic Lt9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ly7/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ly7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lt9/a;->b:Ly7/c;

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt9/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lt9/a;->b:Ly7/c;

    invoke-static {v0, v1, p1}, Lt9/b;->b(Ljava/lang/String;Ly7/c;Ly7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
