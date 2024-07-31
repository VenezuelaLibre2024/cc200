.class public interface abstract Lz6/d0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lz6/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz6/a0;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lz6/a0;-><init>(II[B)V

    sput-object v0, Lz6/d0;->a:Lz6/a0;

    return-void
.end method


# virtual methods
.method public abstract getTile(III)Lz6/a0;
.end method
