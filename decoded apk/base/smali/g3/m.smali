.class public abstract Lg3/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lt8/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lt8/h;->a()Lt8/h$a;

    move-result-object v0

    sget-object v1, Lg3/a;->a:Lr8/a;

    invoke-virtual {v0, v1}, Lt8/h$a;->d(Lr8/a;)Lt8/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lt8/h$a;->c()Lt8/h;

    move-result-object v0

    sput-object v0, Lg3/m;->a:Lt8/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lg3/m;->a:Lt8/h;

    invoke-virtual {v0, p0}, Lt8/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lj3/a;
.end method
