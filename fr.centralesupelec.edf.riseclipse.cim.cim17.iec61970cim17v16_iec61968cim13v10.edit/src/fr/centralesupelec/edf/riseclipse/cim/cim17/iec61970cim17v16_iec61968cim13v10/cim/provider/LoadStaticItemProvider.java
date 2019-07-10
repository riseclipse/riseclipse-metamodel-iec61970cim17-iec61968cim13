/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadStatic} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadStaticItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadStaticItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addEp1PropertyDescriptor( object );
            addEp2PropertyDescriptor( object );
            addEp3PropertyDescriptor( object );
            addEq1PropertyDescriptor( object );
            addEq2PropertyDescriptor( object );
            addEq3PropertyDescriptor( object );
            addKp1PropertyDescriptor( object );
            addKp2PropertyDescriptor( object );
            addKp3PropertyDescriptor( object );
            addKp4PropertyDescriptor( object );
            addKpfPropertyDescriptor( object );
            addKq1PropertyDescriptor( object );
            addKq2PropertyDescriptor( object );
            addKq3PropertyDescriptor( object );
            addKq4PropertyDescriptor( object );
            addKqfPropertyDescriptor( object );
            addStaticLoadModelTypePropertyDescriptor( object );
            addLoadAggregatePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ep1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEp1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_ep1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_ep1_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Ep1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ep2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEp2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_ep2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_ep2_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Ep2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ep3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_ep3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_ep3_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Ep3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Eq1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEq1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_eq1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_eq1_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Eq1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Eq2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEq2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_eq2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_eq2_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Eq2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Eq3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEq3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_eq3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_eq3_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Eq3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKp1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kp1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kp1_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kp1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKp2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kp2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kp2_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kp2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kp3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kp3_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kp3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKp4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kp4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kp4_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kp4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kpf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kpf_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kpf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kq1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKq1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kq1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kq1_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kq1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kq2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKq2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kq2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kq2_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kq2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kq3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKq3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kq3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kq3_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kq3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kq4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKq4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kq4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kq4_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kq4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kqf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKqfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_kqf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_kqf_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_Kqf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Static Load Model Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStaticLoadModelTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_staticLoadModelType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_staticLoadModelType_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_StaticLoadModelType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Load Aggregate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadAggregatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_LoadStatic_LoadAggregate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadStatic_LoadAggregate_feature",
                                "_UI_LoadStatic_type" ),
                        CimPackage.eINSTANCE.getLoadStatic_LoadAggregate(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns LoadStatic.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LoadStatic" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LoadStatic ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_LoadStatic_type" )
                : getString( "_UI_LoadStatic_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( LoadStatic.class ) ) {
        case CimPackage.LOAD_STATIC__EP1:
        case CimPackage.LOAD_STATIC__EP2:
        case CimPackage.LOAD_STATIC__EP3:
        case CimPackage.LOAD_STATIC__EQ1:
        case CimPackage.LOAD_STATIC__EQ2:
        case CimPackage.LOAD_STATIC__EQ3:
        case CimPackage.LOAD_STATIC__KP1:
        case CimPackage.LOAD_STATIC__KP2:
        case CimPackage.LOAD_STATIC__KP3:
        case CimPackage.LOAD_STATIC__KP4:
        case CimPackage.LOAD_STATIC__KPF:
        case CimPackage.LOAD_STATIC__KQ1:
        case CimPackage.LOAD_STATIC__KQ2:
        case CimPackage.LOAD_STATIC__KQ3:
        case CimPackage.LOAD_STATIC__KQ4:
        case CimPackage.LOAD_STATIC__KQF:
        case CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
