.class public interface abstract Lw3/v$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Lw3/v$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw3/w;->b:Lw3/w;

    sput-object v0, Lw3/v$b;->a:Lw3/v$b;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lw3/v$b;->a()V

    return-void
.end method


# virtual methods
.method public abstract release()V
.end method
