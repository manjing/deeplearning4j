/*-
 *
 *  * Copyright 2017 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */
package org.deeplearning4j.nn.modelimport.keras.config;

import lombok.Data;


/**
 * All relevant property fields of keras layers.
 *
 * Empty String fields mean Keras 1 and 2 implementations differ,
 * supplied fields stand for shared properties.
 *
 * @author Max Pumperla
 */
@Data
public class KerasLayerConfiguration {

    private final String LAYER_FIELD_KERAS_VERSION = "keras_version";
    private final String LAYER_FIELD_CLASS_NAME = "class_name";
    private final String LAYER_FIELD_LAYER = "layer";

    /* Basic layer names */
    // Missing Layers: Permute, RepeatVector, Lambda, ActivityRegularization, Masking
    // Conv3D, SeparableConv2D, Deconvolution2D/Conv2DTranspose, Cropping1D-3D, UpSampling1D-3D,
    // ZeroPadding3D, LocallyConnected1D-2D
    // Missing layers from keras 1: AtrousConvolution1D-2D, Highway, MaxoutDense
    private final String LAYER_CLASS_NAME_ACTIVATION = "Activation";
    private final String LAYER_CLASS_NAME_INPUT = "InputLayer";
    private final String LAYER_CLASS_NAME_DROPOUT = "Dropout";
    private final String LAYER_CLASS_NAME_DENSE = "Dense";
    private final String LAYER_CLASS_NAME_LSTM = "LSTM";
    private final String LAYER_CLASS_NAME_MAX_POOLING_1D = "MaxPooling1D";
    private final String LAYER_CLASS_NAME_MAX_POOLING_2D = "MaxPooling2D";
    private final String LAYER_CLASS_NAME_AVERAGE_POOLING_1D = "AveragePooling1D";
    private final String LAYER_CLASS_NAME_AVERAGE_POOLING_2D = "AveragePooling2D";
    private final String LAYER_CLASS_NAME_ZERO_PADDING_1D = "ZeroPadding1D";
    private final String LAYER_CLASS_NAME_ZERO_PADDING_2D = "ZeroPadding2D";
    private final String LAYER_CLASS_NAME_FLATTEN = "Flatten";
    private final String LAYER_CLASS_NAME_RESHAPE = "Reshape";
    private final String LAYER_CLASS_NAME_MERGE = "Merge";
    private final String LAYER_CLASS_NAME_BATCHNORMALIZATION = "BatchNormalization";
    private final String LAYER_CLASS_NAME_TIME_DISTRIBUTED = "TimeDistributed";
    private final String LAYER_CLASS_NAME_EMBEDDING = "Embedding";
    private final String LAYER_CLASS_NAME_GLOBAL_MAX_POOLING_1D = "GlobalMaxPooling1D";
    private final String LAYER_CLASS_NAME_GLOBAL_MAX_POOLING_2D = "GlobalMaxPooling2D";
    private final String LAYER_CLASS_NAME_GLOBAL_AVERAGE_POOLING_1D = "GlobalAveragePooling1D";
    private final String LAYER_CLASS_NAME_GLOBAL_AVERAGE_POOLING_2D = "GlobalAveragePooling2D";
    private final String LAYER_CLASS_NAME_TIME_DISTRIBUTED_DENSE = "TimeDistributedDense"; // Keras 1 only
    private final String LAYER_CLASS_NAME_CONVOLUTION_1D = ""; // 1: Convolution1D, 2: Conv1D
    private final String LAYER_CLASS_NAME_CONVOLUTION_2D = ""; // 1: Convolution2D, 2: Conv2D
    private final String LAYER_CLASS_NAME_LEAKY_RELU = "LeakyReLU";


    /* Partially shared layer configurations. */
    private final String LAYER_FIELD_INPUT_SHAPE = "input_shape";
    private final String LAYER_FIELD_CONFIG = "config";
    private final String LAYER_FIELD_NAME = "name";
    private final String LAYER_FIELD_BATCH_INPUT_SHAPE = "batch_input_shape";
    private final String LAYER_FIELD_INBOUND_NODES = "inbound_nodes";
    private final String LAYER_FIELD_OUTBOUND_NODES = "outbound_nodes";
    private final String LAYER_FIELD_DROPOUT = "dropout";
    private final String LAYER_FIELD_ACTIVITY_REGULARIZER = "activity_regularizer";
    private final String LAYER_FIELD_EMBEDDING_OUTPUT_DIM = "output_dim";
    private final String LAYER_FIELD_OUTPUT_DIM = ""; // 1: output_dim, 2: units
    private final String LAYER_FIELD_DROPOUT_RATE = ""; // 1: p, 2: rate
    private final String LAYER_FIELD_USE_BIAS = ""; // 1: bias, 2: use_bias
    private final String KERAS_PARAM_NAME_W = ""; // 1: W, 2: kernel
    private final String KERAS_PARAM_NAME_B = ""; // 1: b, 2: bias

    /* Keras dimension ordering for, e.g., convolutional layersOrdered. */
    private final String LAYER_FIELD_DIM_ORDERING = ""; // 1: dim_ordering, 2: data_format
    private final String DIM_ORDERING_THEANO = ""; // 1: th, 2: channels_first
    private final String DIM_ORDERING_TENSORFLOW = ""; // 1: tf, 2: channels_last

    /* Recurrent layers */
    private final String LAYER_FIELD_DROPOUT_W = ""; // 1: dropout_W, 2: dropout
    private final String LAYER_FIELD_DROPOUT_U = ""; // 2: dropout_U, 2: recurrent_dropout
    private final String LAYER_FIELD_INNER_INIT = ""; // 1: inner_init, 2: recurrent_initializer
    private final String LAYER_FIELD_RECURRENT_CONSTRAINT = "recurrent_constraint"; // keras 2 only
    private final String LAYER_FIELD_RECURRENT_DROPOUT = ""; // 1: dropout_U, 2: recurrent_dropout
    private final String LAYER_FIELD_INNER_ACTIVATION = ""; // 1: inner_activation, 2: recurrent_activation
    private final String LAYER_FIELD_FORGET_BIAS_INIT = "forget_bias_init"; // keras 1 only: string
    private final String LAYER_FIELD_UNIT_FORGET_BIAS = "unit_forget_bias"; // keras 1 only: bool


    /* Embedding layer properties */
    private final String LAYER_FIELD_INPUT_DIM = "input_dim";
    private final String LAYER_FIELD_EMBEDDING_INIT = ""; // 1: "init", 2: "embeddings_initializer"
    private final String LAYER_FIELD_EMBEDDING_WEIGHTS = ""; // 1: "W", 2: "embeddings"
    private final String LAYER_FIELD_EMBEDDINGS_REGULARIZER = ""; // 1: W_regularizer, 2: embeddings_regularizer
    private final String LAYER_FIELD_EMBEDDINGS_CONSTRAINT = ""; // 1: W_constraint, 2: embeddings_constraint
    private final String LAYER_FIELD_MASK_ZERO = "mask_zero";
    private final String LAYER_FIELD_INPUT_LENGTH = "input_length";

    /* Normalisation layers */
    // Missing: keras 2 moving_mean_initializer, moving_variance_initializer
    private final String LAYER_FIELD_BATCHNORMALIZATION_MODE = "mode"; // keras 1 only
    private final String LAYER_FIELD_BATCHNORMALIZATION_BETA_INIT = ""; // 1: beta_init, 2: beta_initializer
    private final String LAYER_FIELD_BATCHNORMALIZATION_GAMMA_INIT = ""; // 1: gamma_init, 2: gamma_initializer
    private final String LAYER_FIELD_BATCHNORMALIZATION_BETA_CONSTRAINT = "beta_constraint"; // keras 2 only
    private final String LAYER_FIELD_BATCHNORMALIZATION_GAMMA_CONSTRAINT = "gamma_constraint"; // keras 2 only
    private final String LAYER_FIELD_BATCHNORMALIZATION_MOVING_MEAN = ""; // 1: running_mean, 2: moving_mean
    private final String LAYER_FIELD_BATCHNORMALIZATION_MOVING_VARIANCE = ""; // 1: running_std, 2: moving_variance

    /* Advanced activations */
    // Missing: LeakyReLU, PReLU, ThresholdedReLU, ParametricSoftplus, SReLu
    private final String LAYER_FIELD_PRELU_INIT = ""; // 1: init, 2: alpha_initializer

    /* Convolutional layer properties */
    private final String LAYER_FIELD_NB_FILTER = ""; // 1: nb_filter, 2: filters
    private final String LAYER_FIELD_NB_ROW = "nb_row"; // keras 1 only
    private final String LAYER_FIELD_NB_COL = "nb_col"; // keras 1 only
    private final String LAYER_FIELD_KERNEL_SIZE = "kernel_size"; // keras 2 only
    private final String LAYER_FIELD_POOL_SIZE = "pool_size";
    private final String LAYER_FIELD_CONVOLUTION_STRIDES = ""; // 1: subsample, 2: strides
    private final String LAYER_FIELD_DILATION_RATE = "dilation_rate"; // keras 2 only, replaces Atrous layers
    private final String LAYER_FIELD_FILTER_LENGTH = ""; // 1: filter_length, 2: kernel_size
    private final String LAYER_FIELD_SUBSAMPLE_LENGTH = ""; // 1: subsample_length, 2: strides

    /* Pooling / Upsampling layer properties */
    private final String LAYER_FIELD_POOL_STRIDES = "strides";
    private final String LAYER_FIELD_POOL_1D_SIZE = ""; // 1: pool_length, 2: pool_size
    private final String LAYER_FIELD_POOL_1D_STRIDES = ""; // 1: stride, 2: strides
    private final String LAYER_FIELD_UPSAMPLING_SIZE = ""; // 1: length, 2: size

    /* Keras convolution border modes. */
    private final String LAYER_FIELD_BORDER_MODE = ""; // 1: border_mode, 2: padding
    private final String LAYER_BORDER_MODE_SAME = "same";
    private final String LAYER_BORDER_MODE_VALID = "valid";
    private final String LAYER_BORDER_MODE_FULL = "full";

    /* Noise layers */
    // Missing: GaussianNoise, GaussianDropout, AlphaDropout
    private final String LAYER_FIELD_GAUSSIAN_VARIANCE = ""; // 1: sigma, 2: stddev

    /* Layer wrappers */
    // Missing: TimeDistributed, Bidirectional

    /* Keras weight regularizers. */
    private final String LAYER_FIELD_W_REGULARIZER = ""; // 1: W_regularizer, 2: kernel_regularizer
    private final String LAYER_FIELD_B_REGULARIZER = ""; // 1: b_regularizer, 2: bias_regularizer
    private final String REGULARIZATION_TYPE_L1 = "l1";
    private final String REGULARIZATION_TYPE_L2 = "l2";

    /* Keras constraints */
    private final String LAYER_FIELD_W_CONSTRAINT = ""; // 1: W_constraint, 2: kernel_constraint
    private final String LAYER_FIELD_B_CONSTRAINT = ""; // 1: b_constraint, 2: bias_constraint


    /* Keras weight initializers. */
    private final String LAYER_FIELD_INIT = ""; // 1: init, 2: kernel_initializer
    private final String LAYER_FIELD_BIAS_INIT = "bias_initializer"; // keras 2 only

    private final String INIT_UNIFORM = "uniform";
    private final String INIT_RANDOM_UNIFORM = "random_uniform";
    private final String INIT_RANDOM_UNIFORM_ALIAS = "RandomUniform";
    private final String INIT_ZERO = "zero";
    private final String INIT_ZEROS = "zeros";
    private final String INIT_ZEROS_ALIAS = "Zeros";
    private final String INIT_ONE = "one";
    private final String INIT_ONES = "ones";
    private final String INIT_ONES_ALIAS = "Ones";
    private final String INIT_CONSTANT = "constant";
    private final String INIT_CONSTANT_ALIAS = "Constant";
    private final String INIT_TRUNCATED_NORMAL = "truncated_normal";
    private final String INIT_TRUNCATED_NORMAL_ALIAS = "TruncatedNormal";
    private final String INIT_GLOROT_NORMAL = "glorot_normal";
    private final String INIT_GLOROT_UNIFORM = "glorot_uniform";
    private final String INIT_HE_NORMAL = "he_normal";
    private final String INIT_HE_UNIFORM = "he_uniform";
    private final String INIT_LECUN_UNIFORM = "lecun_uniform";
    private final String INIT_LECUN_NORMAL = "lecun_normal";
    private final String INIT_NORMAL = "normal";
    private final String INIT_RANDOM_NORMAL = "random_normal";
    private final String INIT_RANDOM_NORMAL_ALIAS = "RandomNormal";
    private final String INIT_ORTHOGONAL = "orthogonal";
    private final String INIT_ORTHOGONAL_ALIAS = "Orthogonal";
    private final String INIT_IDENTITY = "identity";
    private final String INIT_IDENTITY_ALIAS = "Identity";
    private final String INIT_VARIANCE_SCALING = "VarianceScaling"; // keras 2 only


    /* Keras and DL4J activation types. */
    private final String LAYER_FIELD_ACTIVATION = "activation";

    private final String KERAS_ACTIVATION_SOFTMAX = "softmax";
    private final String KERAS_ACTIVATION_SOFTPLUS = "softplus";
    private final String KERAS_ACTIVATION_SOFTSIGN = "softsign";
    private final String KERAS_ACTIVATION_RELU = "relu";
    private final String KERAS_ACTIVATION_TANH = "tanh";
    private final String KERAS_ACTIVATION_SIGMOID = "sigmoid";
    private final String KERAS_ACTIVATION_HARD_SIGMOID = "hard_sigmoid";
    private final String KERAS_ACTIVATION_LINEAR = "linear";
    private final String KERAS_ACTIVATION_ELU = "elu"; // keras 2 only
    private final String KERAS_ACTIVATION_SELU = "selu"; // keras 2 only

    /* Keras loss functions. */
    private final String KERAS_LOSS_MEAN_SQUARED_ERROR = "mean_squared_error";
    private final String KERAS_LOSS_MSE = "mse";
    private final String KERAS_LOSS_MEAN_ABSOLUTE_ERROR = "mean_absolute_error";
    private final String KERAS_LOSS_MAE = "mae";
    private final String KERAS_LOSS_MEAN_ABSOLUTE_PERCENTAGE_ERROR = "mean_absolute_percentage_error";
    private final String KERAS_LOSS_MAPE = "mape";
    private final String KERAS_LOSS_MEAN_SQUARED_LOGARITHMIC_ERROR = "mean_squared_logarithmic_error";
    private final String KERAS_LOSS_MSLE = "msle";
    private final String KERAS_LOSS_SQUARED_HINGE = "squared_hinge";
    private final String KERAS_LOSS_HINGE = "hinge";
    private final String KERAS_LOSS_CATEGORICAL_HINGE = "categorical_hinge"; // keras 2 only
    private final String KERAS_LOSS_BINARY_CROSSENTROPY = "binary_crossentropy";
    private final String KERAS_LOSS_CATEGORICAL_CROSSENTROPY = "categorical_crossentropy";
    private final String KERAS_LOSS_SPARSE_CATEGORICAL_CROSSENTROPY = "sparse_categorical_crossentropy";
    private final String KERAS_LOSS_KULLBACK_LEIBLER_DIVERGENCE = "kullback_leibler_divergence";
    private final String KERAS_LOSS_KLD = "kld";
    private final String KERAS_LOSS_POISSON = "poisson";
    private final String KERAS_LOSS_COSINE_PROXIMITY = "cosine_proximity";
    private final String KERAS_LOSS_LOG_COSH = "logcosh"; // keras 2 only

}