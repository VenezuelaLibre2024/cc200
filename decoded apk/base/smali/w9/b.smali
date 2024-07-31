.class public abstract Lw9/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lw9/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/gson/internal/d;->c()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    new-instance v0, Lw9/a;

    invoke-direct {v0}, Lw9/a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lw9/c;

    invoke-direct {v0}, Lw9/c;-><init>()V

    :goto_0
    sput-object v0, Lw9/b;->a:Lw9/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lw9/b;
    .locals 1

    sget-object v0, Lw9/b;->a:Lw9/b;

    return-object v0
.end method


# virtual methods
.method public abstract b(Ljava/lang/reflect/AccessibleObject;)V
.end method
