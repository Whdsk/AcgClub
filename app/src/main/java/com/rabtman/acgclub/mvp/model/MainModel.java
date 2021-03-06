package com.rabtman.acgclub.mvp.model;

import com.rabtman.acgclub.mvp.contract.MainContract;
import com.rabtman.common.base.mvp.BaseModel;
import com.rabtman.common.di.scope.ActivityScope;
import com.rabtman.common.integration.IRepositoryManager;
import javax.inject.Inject;

/**
 * @author Rabtman
 */
@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model {

  @Inject
  public MainModel(IRepositoryManager repositoryManager) {
    super(repositoryManager);
  }

}
