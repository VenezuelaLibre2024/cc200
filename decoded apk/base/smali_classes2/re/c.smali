.class public interface abstract Lre/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lre/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lre/b;->b:Lre/b;

    sput-object v0, Lre/c;->a:Lre/c;

    return-void
.end method

.method public static synthetic b(Lre/f0;Lre/d0;)Lre/b0;
    .locals 0

    invoke-static {p0, p1}, Lre/c;->c(Lre/f0;Lre/d0;)Lre/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lre/f0;Lre/d0;)Lre/b0;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract a(Lre/f0;Lre/d0;)Lre/b0;
.end method
