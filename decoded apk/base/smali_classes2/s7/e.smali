.class public final synthetic Ls7/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# instance fields
.field public final synthetic a:Ly7/e0;

.field public final synthetic b:Ly7/e0;

.field public final synthetic c:Ly7/e0;

.field public final synthetic d:Ly7/e0;


# direct methods
.method public synthetic constructor <init>(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/e;->a:Ly7/e0;

    iput-object p2, p0, Ls7/e;->b:Ly7/e0;

    iput-object p3, p0, Ls7/e;->c:Ly7/e0;

    iput-object p4, p0, Ls7/e;->d:Ly7/e0;

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls7/e;->a:Ly7/e0;

    iget-object v1, p0, Ls7/e;->b:Ly7/e0;

    iget-object v2, p0, Ls7/e;->c:Ly7/e0;

    iget-object v3, p0, Ls7/e;->d:Ly7/e0;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->a(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Ls7/d;

    move-result-object p1

    return-object p1
.end method
