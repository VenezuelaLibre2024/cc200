.class public final synthetic Ly7/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/a$a;


# instance fields
.field public final synthetic a:Ly8/a$a;

.field public final synthetic b:Ly8/a$a;


# direct methods
.method public synthetic constructor <init>(Ly8/a$a;Ly8/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/z;->a:Ly8/a$a;

    iput-object p2, p0, Ly7/z;->b:Ly8/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ly8/b;)V
    .locals 2

    iget-object v0, p0, Ly7/z;->a:Ly8/a$a;

    iget-object v1, p0, Ly7/z;->b:Ly8/a$a;

    invoke-static {v0, v1, p1}, Ly7/c0;->d(Ly8/a$a;Ly8/a$a;Ly8/b;)V

    return-void
.end method
