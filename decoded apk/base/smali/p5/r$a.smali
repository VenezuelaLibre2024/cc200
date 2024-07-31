.class public interface abstract Lp5/r$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Lp5/r$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp5/r$a$a;

    invoke-direct {v0}, Lp5/r$a$a;-><init>()V

    sput-object v0, Lp5/r$a;->a:Lp5/r$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;)V
.end method
