.class public interface abstract Ldc/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ldc/a;

.field public static final b:Ldc/a;

.field public static final c:Ldc/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldc/e;

    invoke-direct {v0}, Ldc/e;-><init>()V

    sput-object v0, Ldc/a;->a:Ldc/a;

    new-instance v0, Ldc/b;

    invoke-direct {v0}, Ldc/b;-><init>()V

    sput-object v0, Ldc/a;->b:Ldc/a;

    new-instance v0, Ldc/d;

    invoke-direct {v0}, Ldc/d;-><init>()V

    sput-object v0, Ldc/a;->c:Ldc/a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V
.end method
