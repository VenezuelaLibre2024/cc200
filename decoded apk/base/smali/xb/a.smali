.class public interface abstract Lxb/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lxb/a;

.field public static final b:Lxb/a;

.field public static final c:Lxb/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxb/b;

    invoke-direct {v0}, Lxb/b;-><init>()V

    sput-object v0, Lxb/a;->a:Lxb/a;

    new-instance v0, Lxb/d;

    invoke-direct {v0}, Lxb/d;-><init>()V

    sput-object v0, Lxb/a;->b:Lxb/a;

    new-instance v0, Lxb/c;

    invoke-direct {v0}, Lxb/c;-><init>()V

    sput-object v0, Lxb/a;->c:Lxb/a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V
.end method

.method public abstract b(I)I
.end method
