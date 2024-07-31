.class public interface abstract Lyb/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lyb/a;

.field public static final b:Lyb/a;

.field public static final c:Lyb/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyb/c;

    invoke-direct {v0}, Lyb/c;-><init>()V

    sput-object v0, Lyb/a;->a:Lyb/a;

    new-instance v0, Lyb/e;

    invoke-direct {v0}, Lyb/e;-><init>()V

    sput-object v0, Lyb/a;->b:Lyb/a;

    new-instance v0, Lyb/d;

    invoke-direct {v0}, Lyb/d;-><init>()V

    sput-object v0, Lyb/a;->c:Lyb/a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V
.end method
